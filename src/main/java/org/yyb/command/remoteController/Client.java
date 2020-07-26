package org.yyb.command.remoteController;

public class Client {

    public static void main(String[] args) {

        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();

        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("=============按下灯的开按钮================");

        remoteController.onButtonWasPushed(0);

        System.out.println("=============按下灯的关按钮================");

        remoteController.offButtonWasPushed(0);

        System.out.println("=============按下灯的撤销按钮================");

        remoteController.undoButtonWasPushed();
    }
}
