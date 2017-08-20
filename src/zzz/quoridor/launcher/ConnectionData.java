
package zzz.quoridor.launcher;

import java.io.Serializable;

public class ConnectionData implements Serializable {
    
    private String host, port, room, nickname;

    public ConnectionData(String host, String port, String room, String nickname) {
        this.host = host;
        this.port = port;
        this.room = room;
        this.nickname = nickname;
    }
    
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    public boolean validateHost() {
        return !host.isEmpty() && !host.contains(" ");
    }
    
    public boolean validatePort() {
        try {
            int portInt = Integer.parseInt(port);
            if (portInt < 1 || portInt > 65535) {
                throw new IllegalArgumentException();
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean validateRoom() {
        return !room.isEmpty() && !room.contains(" ");
    }
    
    public boolean validateNickname() {
        return !nickname.isEmpty();
    }
    
    public String validateFields() {
        if (!validateHost()) {
            return "host";
        }
        if (!validatePort()) {
            return "port";
        }
        if (!validateRoom()) {
            return "room";
        }
        if (!validateNickname()) {
            return "nickname";
        }
        return null;
    }
    
}
