package io.github.project.openubl.xsender.events.amqp;

import io.github.project.openubl.xsender.models.ErrorType;
import io.github.project.openubl.xsender.sender.XSenderRequiredData;

import java.util.Date;
import java.util.Set;

public class DocumentCache {
    private final String id;
    private final String storageFile;
    private final String namespaceId;

    private ErrorType error;
    private Boolean fileValid;
    private boolean inProgress;
    public Date scheduledDelivery;

    private String ruc;
    private String documentID;
    private String documentType;
    private String voidedLineDocumentTypeCode;

    private String sunatStatus;
    private Integer sunatCode;
    private String sunatDescription;
    private String sunatTicket;
    private Set<String> sunatNotes;

    private byte[] file;
    private byte[] cdrFile;
    private String cdrFileId;
    private XSenderRequiredData wsConfig;

    public DocumentCache(String id, String storageFile, String namespaceId) {
        this.id = id;
        this.storageFile = storageFile;
        this.namespaceId = namespaceId;
    }

    public String getId() {
        return id;
    }

    public String getStorageFile() {
        return storageFile;
    }

    public ErrorType getError() {
        return error;
    }

    public void setError(ErrorType error) {
        this.error = error;
    }

    public Boolean getFileValid() {
        return fileValid;
    }

    public void setFileValid(Boolean fileValid) {
        this.fileValid = fileValid;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDocumentID() {
        return documentID;
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getVoidedLineDocumentTypeCode() {
        return voidedLineDocumentTypeCode;
    }

    public void setVoidedLineDocumentTypeCode(String voidedLineDocumentTypeCode) {
        this.voidedLineDocumentTypeCode = voidedLineDocumentTypeCode;
    }

    public String getSunatStatus() {
        return sunatStatus;
    }

    public void setSunatStatus(String sunatStatus) {
        this.sunatStatus = sunatStatus;
    }

    public Integer getSunatCode() {
        return sunatCode;
    }

    public void setSunatCode(Integer sunatCode) {
        this.sunatCode = sunatCode;
    }

    public String getSunatDescription() {
        return sunatDescription;
    }

    public void setSunatDescription(String sunatDescription) {
        this.sunatDescription = sunatDescription;
    }

    public String getSunatTicket() {
        return sunatTicket;
    }

    public void setSunatTicket(String sunatTicket) {
        this.sunatTicket = sunatTicket;
    }

    public Set<String> getSunatNotes() {
        return sunatNotes;
    }

    public void setSunatNotes(Set<String> sunatNotes) {
        this.sunatNotes = sunatNotes;
    }

    public Date getScheduledDelivery() {
        return scheduledDelivery;
    }

    public void setScheduledDelivery(Date scheduledDelivery) {
        this.scheduledDelivery = scheduledDelivery;
    }

    public boolean isInProgress() {
        return inProgress;
    }

    public void setInProgress(boolean inProgress) {
        this.inProgress = inProgress;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public String getNamespaceId() {
        return namespaceId;
    }

    public XSenderRequiredData getWsConfig() {
        return wsConfig;
    }

    public void setWsConfig(XSenderRequiredData wsConfig) {
        this.wsConfig = wsConfig;
    }

    public byte[] getCdrFile() {
        return cdrFile;
    }

    public void setCdrFile(byte[] cdrFile) {
        this.cdrFile = cdrFile;
    }

    public String getCdrFileId() {
        return cdrFileId;
    }

    public void setCdrFileId(String cdrFileId) {
        this.cdrFileId = cdrFileId;
    }
}
