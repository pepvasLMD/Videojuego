package com.pepe.game.BlockBunny.handlers;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;

/**
 * Created by alumno6 on 5/8/18.
 */

public class BBInputProcessor extends InputAdapter
{
    public boolean mouseMoved(int x, int y) {
        BBInput.x = x;
        BBInput.y = y;
        return true;
    }

    public boolean touchDragged(int x, int y, int pointer) {
        BBInput.x = x;
        BBInput.y = y;
        BBInput.down = true;
        return true;
    }

    public boolean touchDown(int x, int y, int pointer, int button) {
        BBInput.x = x;
        BBInput.y = y;
        BBInput.down = true;
        return true;
    }

    public boolean touchUp(int x, int y, int pointer, int button) {
        BBInput.x = x;
        BBInput.y = y;
        BBInput.down = false;
        return true;
    }

    public boolean keyDown(int k) {
        if(k == Keys.Z) BBInput.setKey(BBInput.BUTTON1, true);
        if(k == Keys.X) BBInput.setKey(BBInput.BUTTON2, true);
        return true;
    }

    public boolean keyUp(int k) {
        if(k == Keys.Z) BBInput.setKey(BBInput.BUTTON1, false);
        if(k == Keys.X) BBInput.setKey(BBInput.BUTTON2, false);
        return true;
    }
}
