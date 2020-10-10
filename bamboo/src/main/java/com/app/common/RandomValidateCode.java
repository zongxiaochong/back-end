package com.app.common;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

import com.app.util.StringUtils;

/**
 * 验证码生成器
 * @author weizong
 */
public class RandomValidateCode {
	
	private final Random random = new Random();
	private int width = 135;	//图片宽
	private int height = 40;	//图片高
	private int stringNumber = 4;	//随机产生字符数量
	private final int lineSize = 60;	//干扰线数量
	private final int fontSize = 30;
	
	private String validateCode;
	
	public RandomValidateCode() {
	}
	
	public RandomValidateCode(int width, int height, int stringNumber) {
		this.width = width;
		this.height = height;
		this.stringNumber = stringNumber;
	}
	
	/**
	 * 获取验证码图片base64编码
	 * @return
	 */
	public String getValidateCodeImage() {
		BufferedImage image = new BufferedImage(this.width, this.height, BufferedImage.TYPE_INT_RGB);
		Graphics graphics = image.getGraphics();
		graphics.fillRect(0, 0, width, height);
		graphics.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, fontSize));
		graphics.setColor(this.getRandColor(110, 133));
        // 绘制干扰线
        for (int i = 0; i <= this.lineSize; i++) {
            this.drawLine(graphics);
        }
        // 绘制随机字符
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= this.stringNumber; i++) {
            String rand = this.drawString(graphics, i);
            sb.append(rand);
        }
        graphics.dispose();
        this.validateCode = sb.toString();
        ByteArrayOutputStream ous = new ByteArrayOutputStream();
        try {
			ImageIO.write(image, "PNG", ous);
			byte[] byteArray = ous.toByteArray();
			String imageBase64 = StringUtils.byteArrayToBase64(byteArray);
			return imageBase64;
		} catch (IOException e) {
			e.printStackTrace();
		} 
        return null;
	}
	
	
	/**
	 * 绘制字符串
	 */
	private String drawString(Graphics g, int i){
		g.setFont(this.getFont());
		g.setColor(new Color(this.random.nextInt(155), this.random.nextInt(123), this.random.nextInt(176)));
		String rand = StringUtils.randomCode(1);
	    g.translate(this.random.nextInt(3), this.random.nextInt(3));
	    g.drawString(rand, (this.width / this.stringNumber - 14) * i, this.height - 7);
		return rand;
	}
	
	/**
	 * 获得字体
	 * @return
	 */
	private Font  getFont() {
		return new Font("Times New Roman", Font.CENTER_BASELINE, this.fontSize);
	}
	
	/**
	 * 绘制干扰线
	 */
	private void drawLine(Graphics g){
		int x = this.random.nextInt(this.width);
		int y = this.random.nextInt(this.height);
		//int xl = this.random.nextInt(13);
		int yl = this.random.nextInt(15);
		g.drawLine(x, y, x, y+yl);
	}
	
	 /**
     * 获得颜色
     */
    private Color getRandColor(int fc, int bc) {
        if (fc > 255) {
            fc = 255;
        }
        if (bc > 255) {
            bc = 255;
        }
        int r = fc + this.random.nextInt(bc - fc - 16);
        int g = fc + this.random.nextInt(bc - fc - 14);
        int b = fc + this.random.nextInt(bc - fc - 18);
        return new Color(r, g, b);
    }
    
    /**
     * 验证码
     * @return
     */
    public String getValidateCode() {
		return validateCode;
	}
	
}
