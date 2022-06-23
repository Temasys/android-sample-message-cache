package sg.com.temasys.skylink.sdk.sampleapp.service.model;

import sg.com.temasys.skylink.sdk.sampleapp.utils.MessageRowType;

public class MessageModel {
    private String messageContent;
    private String peerId;
    private String peerUserName;
    private String timeStamp;
    private MessageRowType messageRowType;

    public MessageModel() {
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getPeerId() {
        return peerId;
    }

    public void setPeerId(String peerId) {
        this.peerId = peerId;
    }

    public String getPeerUserName() {
        return peerUserName;
    }

    public void setPeerUserName(String peerUserName) {
        this.peerUserName = peerUserName;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public MessageRowType getMessageRowType() {
        return messageRowType;
    }

    public void setMessageRowType(MessageRowType messageRowType) {
        this.messageRowType = messageRowType;
    }
}
