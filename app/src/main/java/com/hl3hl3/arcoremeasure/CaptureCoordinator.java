package com.hl3hl3.arcoremeasure;

import java.util.ArrayList;

public class CaptureCoordinator {
    private static ArrayList<CaptureListener> listeners = new ArrayList<>();

    public static void setListener(CaptureListener listener) {
        listeners.add(listener);
    }

    public static void onCapture() {
        for (int i = 0; i < listeners.size(); i++) {
            listeners.get(i).onCapture();
        }
    }
}
