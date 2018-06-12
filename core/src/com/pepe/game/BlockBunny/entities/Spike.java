package com.pepe.game.BlockBunny.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.physics.box2d.Body;
import com.pepe.game.BlockBunny.Game;

/**
 * Created by alumno6 on 5/9/18.
 */

public class Spike extends B2DSprite
{
    public Spike(Body body) {

        super(body);

        Texture tex = Game.res.getTexture("spikes");
        TextureRegion[] sprites = TextureRegion.split(tex, 32, 32)[0];
        animation.setFrames(sprites, 1 / 12f);

        width = sprites[0].getRegionWidth();
        height = sprites[0].getRegionHeight();

    }
}
