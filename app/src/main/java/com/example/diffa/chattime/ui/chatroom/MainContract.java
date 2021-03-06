package com.example.diffa.chattime.ui.chatroom;

import android.content.Intent;

import com.example.diffa.chattime.model.User;
import com.qiscus.sdk.chat.core.data.model.QiscusChatRoom;

import java.util.List;

public class MainContract {

    public interface View {
        void showChatRooms(List<QiscusChatRoom> chatRooms);

        void showChatRoomPage(QiscusChatRoom qiscusChatRoom);
        void showChatRoomPageGroup(QiscusChatRoom qiscusChatRoom);
        void showErrorMessage(String errorMessage);
    }

    interface Presenter {
        void openChat(QiscusChatRoom chatRoom);
        void logout();
        void loadChatRooms();
    }
}
