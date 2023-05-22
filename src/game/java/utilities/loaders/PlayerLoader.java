package utilities.loaders;

import utilities.constans.Constants;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import static utilities.constans.Constants.PlayerConstants.*;

public class PlayerLoader {
    public static BufferedImage importImg(String path){
        InputStream is = PlayerLoader.class.getResourceAsStream(path);
        try {
            return ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    public static BufferedImage[][] loadPlayerAnimations() {
        BufferedImage[][] animations = new BufferedImage[9][7];
        for (int i = 0; i < GetSpriteAmount(IDLE); ++i) {
            animations[IDLE][i] = importImg(Constants.PlayerPaths.IDLE + i + Constants.PlayerPaths.EXT);
        }
        for (int i = 0; i < GetSpriteAmount(RUNNING); ++i) {
            animations[RUNNING][i] = importImg(Constants.PlayerPaths.RUNNING + i + Constants.PlayerPaths.EXT);
        }
        for (int i = 0; i < GetSpriteAmount(JUMP); ++i) {
            animations[JUMP][i] = importImg(Constants.PlayerPaths.JUMP + i + Constants.PlayerPaths.EXT);
        }
        for (int i = 0; i < GetSpriteAmount(FALLING); ++i) {
            animations[FALLING][i] = importImg(Constants.PlayerPaths.FALLING + i + Constants.PlayerPaths.EXT);
        }
        for (int i = 0; i < GetSpriteAmount(HIT); ++i) {
            animations[HIT][i] = importImg(Constants.PlayerPaths.HIT + i + Constants.PlayerPaths.EXT);
        }
        for (int i = 0; i < GetSpriteAmount(ATTACK_1); ++i) {
            animations[ATTACK_1][i] = importImg(Constants.PlayerPaths.ATTACK1 + i + Constants.PlayerPaths.EXT);
        }
        for (int i = 0; i < GetSpriteAmount(ATTACK_2); ++i) {
            animations[ATTACK_2][i] = importImg(Constants.PlayerPaths.ATTACK2 + i + Constants.PlayerPaths.EXT);
        }
        for (int i = 0; i < GetSpriteAmount(DIE); ++i) {
            animations[DIE][i] = importImg(Constants.PlayerPaths.DIE + i + Constants.PlayerPaths.EXT);
        }
        return animations;
    }
}
