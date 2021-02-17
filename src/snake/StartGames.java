package snake;

import javax.swing.*;

public class StartGames {
    public static void main(String[] args) {
        //1.绘制一个静态窗口 JFrame
        JFrame frame = new JFrame("秋安的贪吃蛇小游戏");
        //2.设置界面的大小
        frame.setBounds(10,10,900,720);
        frame.setResizable(false);//窗口大小不可改变
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点x结束游戏

        //面板 JPanel
        frame.add(new GamePanel());

        frame.setVisible(true);//让窗口展现出来
    }
}
