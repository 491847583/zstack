package org.zstack.header.vm;

import org.zstack.header.errorcode.ErrorCode;
import org.zstack.header.message.NeedJsonSchema;

/**
 */
public class VmTracerCanonicalEvents {
    public static final String VM_STATE_CHANGED_PATH = "/vmTracer/vmStateChanged";
    public static final String STRANGER_VM_FOUND_PATH = "/vmTracer/strangerVmFound";
    public static final String VM_OPERATE_FAIL_ON_HYPERVISOR_PATH = "/vmTracer/vmOperateFailOnHypervisor";
    public static final String VM_STATE_IN_SHUTDOWN_PATH = "/vmTracer/vmStateInShutdown";

    @NeedJsonSchema
    public static class VmStateInShutdownData {
        private String vmUuid;
        private ErrorCode reason;

        public String getVmUuid() {
            return vmUuid;
        }

        public void setVmUuid(String vmUuid) {
            this.vmUuid = vmUuid;
        }

        public ErrorCode getReason() {
            return reason;
        }

        public void setReason(ErrorCode reason) {
            this.reason = reason;
        }
    }

    @NeedJsonSchema
    public static class OperateFailOnHypervisorData {
        private String vmUuid;
        private String hostUuid;
        private String operate;
        private String result;

        public String getVmUuid() {
            return vmUuid;
        }

        public void setVmUuid(String vmUuid) {
            this.vmUuid = vmUuid;
        }

        public String getHostUuid() {
            return hostUuid;
        }

        public void setHostUuid(String hostUuid) {
            this.hostUuid = hostUuid;
        }

        public String getOperate() {
            return operate;
        }

        public void setOperate(String operate) {
            this.operate = operate;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }
    }

    @NeedJsonSchema
    public static class StrangerVmFoundData {
        private String vmIdentity;
        private String hostUuid;
        private String vmState;

        public String getHostUuid() {
            return hostUuid;
        }

        public void setHostUuid(String hostUuid) {
            this.hostUuid = hostUuid;
        }

        public String getVmIdentity() {
            return vmIdentity;
        }

        public void setVmIdentity(String vmIdentity) {
            this.vmIdentity = vmIdentity;
        }

        public VmInstanceState getVmState() {
            if (vmState != null) {
                return VmInstanceState.valueOf(vmState);
            }
            return null;
        }

        public void setVmState(VmInstanceState vmState) {
            if (vmState != null) {
                this.vmState = vmState.toString();
            }
        }
    }

    @NeedJsonSchema
    public static class VmStateChangedOnHostData {
        private String vmUuid;
        private String from;
        private String to;
        private String originalHostUuid;
        private String currentHostUuid;

        public String getOriginalHostUuid() {
            return originalHostUuid;
        }

        public void setOriginalHostUuid(String originalHostUuid) {
            this.originalHostUuid = originalHostUuid;
        }

        public String getCurrentHostUuid() {
            return currentHostUuid;
        }

        public void setCurrentHostUuid(String currentHostUuid) {
            this.currentHostUuid = currentHostUuid;
        }

        public String getVmUuid() {
            return vmUuid;
        }

        public void setVmUuid(String vmUuid) {
            this.vmUuid = vmUuid;
        }

        public VmInstanceState getFrom() {
            if (from != null) {
                return VmInstanceState.valueOf(from);
            }
            return null;
        }

        public void setFrom(VmInstanceState from) {
            if (from != null) {
                this.from = from.toString();
            }
        }

        public VmInstanceState getTo() {
            if (to != null) {
                return VmInstanceState.valueOf(to);
            }
            return null;
        }

        public void setTo(VmInstanceState to) {
            if (to != null) {
                this.to = to.toString();
            }
        }
    }
}
