package com.abhra.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media musicPlayer = new CdPlayer();

    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void accelearate() {
        engine.accelearate();
    }

    public void musicStrat() {
        musicPlayer.start();
    }
    public void musicStop() {
        musicPlayer.stop();
    }
}
