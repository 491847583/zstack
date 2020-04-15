package org.zstack.header.network.l3

import java.lang.Integer
import java.lang.Integer
import org.zstack.header.network.l3.IpRangeType
import java.sql.Timestamp
import java.sql.Timestamp

doc {

	title "在这里输入结构的名称"

	field {
		name "uuid"
		desc "资源的UUID，唯一标示该资源"
		type "String"
		since "0.6"
	}
	field {
		name "l3NetworkUuid"
		desc "三层网络UUID"
		type "String"
		since "0.6"
	}
	field {
		name "name"
		desc "资源名称"
		type "String"
		since "0.6"
	}
	field {
		name "description"
		desc "资源的详细描述"
		type "String"
		since "0.6"
	}
	field {
		name "startIp"
		desc ""
		type "String"
		since "0.6"
	}
	field {
		name "endIp"
		desc ""
		type "String"
		since "0.6"
	}
	field {
		name "netmask"
		desc ""
		type "String"
		since "0.6"
	}
	field {
		name "prefixLen"
		desc "掩码长度"
		type "String"
		since "3.1"
	}
	field {
		name "gateway"
		desc ""
		type "String"
		since "0.6"
	}
	field {
		name "networkCidr"
		desc ""
		type "String"
		since "0.6"
	}
	field {
		name "ipVersion"
		desc "ip协议号"
		type "Integer"
		since "3.1"
	}
	field {
		name "addressMode"
		desc "IPv6地址分配模式"
		type "String"
		since "3.1"
	}
	ref {
		name "ipRangeType"
		path "org.zstack.header.network.l3.IpRangeInventory.ipRangeType"
		desc "null"
		type "IpRangeType"
		since "0.6"
		clz IpRangeType.class
	}
	field {
		name "createDate"
		desc "创建时间"
		type "Timestamp"
		since "0.6"
	}
	field {
		name "lastOpDate"
		desc "最后一次修改时间"
		type "Timestamp"
		since "0.6"
	}
}
