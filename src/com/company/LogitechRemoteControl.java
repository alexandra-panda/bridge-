package com.company;

public class LogitechRemoteControl extends AbstractRemoteControl {

    public LogitechRemoteControl(ITV tv) {
        super(tv);
    }

    public void setChannelKeyboard(int channel){
        setChannel(channel);
        System.out.println("Logitech folosește keyword pentru a seta canalul.");
    }
}