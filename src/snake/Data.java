package snake;

import javax.swing.*;
import java.net.URL;

public class Data {
    //头部的图片 URL:定位图片的地址 ImageIcon: 图片
    public static URL headerURL = Data.class.getResource("/static/header.png");
    public static ImageIcon header = new ImageIcon(headerURL);
    //蛇头
    public static URL upURL = Data.class.getResource("/static/up.png");
    public static ImageIcon up = new ImageIcon(upURL);
    public static URL downURL = Data.class.getResource("/static/down.png");
    public static ImageIcon down = new ImageIcon(downURL);
    public static URL leftURL = Data.class.getResource("/static/left.png");
    public static ImageIcon left = new ImageIcon(leftURL);
    public static URL rightURL = Data.class.getResource("/static/right.png");
    public static ImageIcon right = new ImageIcon(rightURL);
    //蛇身
    public static URL bodyURL = Data.class.getResource("/static/body.png");
    public static ImageIcon body = new ImageIcon(bodyURL);
    //食物
    public static URL foodURL = Data.class.getResource("/static/food.png");
    public static ImageIcon food = new ImageIcon(foodURL);
}
