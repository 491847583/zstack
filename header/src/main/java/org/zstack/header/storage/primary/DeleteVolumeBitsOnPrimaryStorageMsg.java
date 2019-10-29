package org.zstack.header.storage.primary;

import org.zstack.header.message.NeedReplyMessage;

/**
 * DeleteVolumeBitsOnPrimaryStorageMsg means we delete volume
 * @see DeleteBitsOnPrimaryStorageMsg
 */
public class DeleteVolumeBitsOnPrimaryStorageMsg extends NeedReplyMessage implements PrimaryStorageMessage {
    private String primaryStorageUuid;
    private String installPath;
    private String hypervisorType;
    private boolean folder;
    private String bitsUuid;
    private String bitsType;
    private String hostUuid;

    public String getBitsUuid() {
        return bitsUuid;
    }

    public void setBitsUuid(String bitsUuid) {
        this.bitsUuid = bitsUuid;
    }

    public String getBitsType() {
        return bitsType;
    }

    public void setBitsType(String bitsType) {
        this.bitsType = bitsType;
    }

    public boolean isFolder() {
        return folder;
    }

    public void setFolder(boolean folder) {
        this.folder = folder;
    }

    @Override
    public String getPrimaryStorageUuid() {
        return primaryStorageUuid;
    }

    public void setPrimaryStorageUuid(String primaryStorageUuid) {
        this.primaryStorageUuid = primaryStorageUuid;
    }

    public String getInstallPath() {
        return installPath;
    }

    public String getHypervisorType() {
        return hypervisorType;
    }

    public void setHypervisorType(String hypervisorType) {
        this.hypervisorType = hypervisorType;
    }

    public void setInstallPath(String installPath) {
        this.installPath = installPath;
    }

    public String getHostUuid() {
        return hostUuid;
    }

    public void setHostUuid(String hostUuid) {
        this.hostUuid = hostUuid;
    }
}
