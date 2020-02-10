package org.zstack.core.errorcode;

import org.zstack.header.message.APIReply;
import org.zstack.header.rest.RestResponse;
import org.zstack.utils.string.ErrorCodeElaboration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mingjian.deng on 2018/12/1.
 */
@RestResponse(allTo = "contents")
public class APIGetElaborationsReply extends APIReply {
    private List<ElaborationContent> contents = new ArrayList<>();

    public List<ElaborationContent> getContents() {
        return contents;
    }

    public void setContents(List<ElaborationContent> contents) {
        this.contents = contents;
    }

    public static APIGetElaborationsReply __example__() {
        APIGetElaborationsReply reply = new APIGetElaborationsReply();
        List<ElaborationContent> e = new ArrayList<>();
        ErrorCodeElaboration elaboration = new ErrorCodeElaboration();
        elaboration.setCategory("HOST");
        elaboration.setCode("1003");
        elaboration.setRegex("host[uuid:%s, name:%s] is in status[%s], cannot perform required operation");
        elaboration.setMessage_cn("物理机正处于[停止]状态，不能进行该操作");
        elaboration.setMessage_en("Host is in status[Stopped], cannot perform required operation");
        elaboration.setCauses_cn("物理机正处于[%3$s]状态,当前状态不允许进行该操作");
        elaboration.setCauses_en("Host is in status [%3$s]");
        elaboration.setOperation_cn("请等待物理机退出[%3$s]状态");
        elaboration.setOperation_en("please wait until quit [%3$s] status");

        e.add(new ElaborationContent(elaboration));
        reply.setContents(e);
        return reply;
    }
}
