package org.zstack.sdk;



public class IpCapacityData  {

    public java.lang.String resourceUuid;
    public void setResourceUuid(java.lang.String resourceUuid) {
        this.resourceUuid = resourceUuid;
    }
    public java.lang.String getResourceUuid() {
        return this.resourceUuid;
    }

    public long totalCapacity;
    public void setTotalCapacity(long totalCapacity) {
        this.totalCapacity = totalCapacity;
    }
    public long getTotalCapacity() {
        return this.totalCapacity;
    }

    public long availableCapacity;
    public void setAvailableCapacity(long availableCapacity) {
        this.availableCapacity = availableCapacity;
    }
    public long getAvailableCapacity() {
        return this.availableCapacity;
    }

    public long usedIpAddressNumber;
    public void setUsedIpAddressNumber(long usedIpAddressNumber) {
        this.usedIpAddressNumber = usedIpAddressNumber;
    }
    public long getUsedIpAddressNumber() {
        return this.usedIpAddressNumber;
    }

}
