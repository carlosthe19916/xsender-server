/**
 * Copyright 2019 Project OpenUBL, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Eclipse Public License - v 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.project.openubl.xsender.basic.resources.config;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;
import org.testcontainers.containers.BindMode;
import org.testcontainers.containers.FixedHostPortGenericContainer;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.wait.strategy.Wait;

import java.util.Collections;
import java.util.Map;

public class KeycloakServer implements QuarkusTestResourceLifecycleManager {

    private GenericContainer keycloak;

    @Override
    public Map<String, String> start() {
        keycloak = new FixedHostPortGenericContainer("quay.io/keycloak/keycloak:" + System.getProperty("keycloak.version", "12.0.1"))
                .withFixedExposedPort(8180, 8080)
                .withEnv("DB_VENDOR", "H2")
                .withEnv("KEYCLOAK_USER", "admin")
                .withEnv("KEYCLOAK_PASSWORD", "admin")
                .withEnv("KEYCLOAK_IMPORT", "/tmp/realm.json")
                .withClasspathResourceMapping("openubl-realm.json", "/tmp/realm.json", BindMode.READ_ONLY)
                .waitingFor(Wait.forHttp("/auth"));
        keycloak.start();
        return Collections.emptyMap();
    }

    @Override
    public void stop() {
        keycloak.stop();
    }
}
