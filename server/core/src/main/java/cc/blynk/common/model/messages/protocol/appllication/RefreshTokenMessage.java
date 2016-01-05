package cc.blynk.common.model.messages.protocol.appllication;

import cc.blynk.common.model.messages.StringMessage;

import static cc.blynk.common.enums.Command.*;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 2/1/2015.
 */
public class RefreshTokenMessage extends StringMessage {

    public RefreshTokenMessage(int messageId, String body) {
        super(messageId, REFRESH_TOKEN, body.length(), body);
    }

    @Override
    public String toString() {
        return "RefreshTokenMessage{" + super.toString() + "}";
    }
}