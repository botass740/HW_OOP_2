package ru.netology.javaqamvn;

public class Radio {
    private int currentStation;
    private int maxStation;
    private int currentVolume;


    public Radio() {
        maxStation = 9;
    }

    public Radio(int quantityStation) {
        maxStation = quantityStation - 1;
    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void up() {
        if (currentVolume != 100) {
            currentVolume++;
        }
    }

    public void down() {
        if (currentVolume != 0) {
            currentVolume--;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }
}
