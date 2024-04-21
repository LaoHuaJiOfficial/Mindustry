package mindustry.debug;

import arc.util.Time;

public class Debug{
    public static float updateTimer;
    public static float drawTimer;
    public static float UITimer;

    public static long startUpdateTime, updateTime;


    public static long updateTotalTime;

    public static long renderPreRender;
    public static long renderFloorWall;
    public static long renderShaders;
    public static long renderOverlayUI;
    public static long renderFOW;
    public static long renderLaunch;
    public static long renderBuild;
    public static long renderEntity;
    public static long renderFlush;
    public static long renderTotalTime;

    public static long UITotalTime;

    public static boolean debugTimer(float timer){
        timer += Time.delta;
        if (timer >= Time.toSeconds){
            timer = 0f;
            return true;
        }
        return false;
    }

}
