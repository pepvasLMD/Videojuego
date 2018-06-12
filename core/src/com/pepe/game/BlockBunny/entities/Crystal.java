package com.pepe.game.BlockBunny.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.physics.box2d.Body;
import com.pepe.game.BlockBunny.Game;

/**
 * Created by alumno6 on 5/6/18.
 */

public class Crystal extends B2DSprite
{
    public Crystal(Body body) {

        super(body);

        Texture tex = Game.res.getTexture("crystal");
        TextureRegion[] sprites = TextureRegion.split(tex, 16, 16)[0];

        setAnimation(sprites, 1 / 12f);

    }
}
