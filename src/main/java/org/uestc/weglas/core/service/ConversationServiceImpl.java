package org.uestc.weglas.core.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.uestc.weglas.base.mapper.ConversationChatDetailMapper;
import org.uestc.weglas.base.mapper.ConversationMapper;
import org.uestc.weglas.core.model.Conversation;
import org.uestc.weglas.core.model.ConversationChatDetail;

import java.util.List;

/**
 * @author yingxian.cyx
 * @date Created in 2024/10/11
 */
@Service
@Slf4j
public class ConversationServiceImpl implements ConversationService {

    /**
     * （仓储层）数据表映射mapper
     */
    @Autowired
    private ConversationMapper conversationMapper;

    /**
     * （仓储层）数据表映射mapper
     */
    @Autowired
    private ConversationChatDetailMapper conversationChatDetailMapper;

    /**
     * 新建会话，包括新建一条conversation记录+chat_detail记录
     * @param conversation 会话
     */
    @Override
    @Transactional
    public void add(Conversation conversation) {
    }

    /**
     * 单条会话查询
     * @param conversationId key值
     * @return
     */
    @Override
    public Conversation queryById(Integer conversationId) {
        return null;
    }

    /**
     * 会话记录列表查询
     * @return
     */
    @Override
    public List<Conversation> queryAll() {
        return null;
    }

    /**
     * 删除会话
     * @param conversationId
     */
    @Override
    public void remove(Integer conversationId) {
    }

    /**
     * 新建一条chat_detail记录
     * @param chat 会话id
     */
    @Override
    @Transactional
    public void addChat(ConversationChatDetail chat) {
    }

    /**
     * 删除一条chat_detail记录
     * @param chatId
     */
    @Override
    public void removeChat(Integer chatId) {
    }
}
