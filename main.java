int graceId = 11849;

WorldPoint save_1 = new WorldPoint(3508, 3488, 0); //start
int opBlock = 3; // kek
//L1
int lap_1 = 14843;
WorldPoint post_lap_1 = new WorldPoint(3506, 3492, 2); 
//L2
int lap_2 = 14844;
//L3
int lap_3 = 14845;
WorldPoint post_lap_2 = new WorldPoint(3502, 3504, 2); 
WorldPoint lap_3_grace = new WorldPoint(3501, 3505, 2); 
//L4
int lap_4 = 14848;
WorldPoint post_lap_3 = new WorldPoint(3492, 3504, 2); 
WorldPoint lap_4_grace = new WorldPoint(3490, 3501, 2); 
//L5
int lap_5 = 14846;
WorldPoint post_lap_4 = new WorldPoint(3479, 3499, 3); 
WorldPoint lap_5_grace = new WorldPoint(3478, 3496, 3); 
//L6
int lap_6 = 14894;
WorldPoint post_lap_5 = new WorldPoint(3478, 3486, 2); 
WorldPoint lap_6_grace = new WorldPoint(3478, 3484, 2); 

//L7
int lap_7 = 14847;
WorldPoint post_lap_6 = new WorldPoint(3489, 3476, 3); 
//L8
int lap_8 = 14897;
WorldPoint post_lap_7 = new WorldPoint(3510, 3476, 2); 



WorldPoint currentLocation = client.getLocalPlayer().getWorldLocation();

if (client.getEnergy() >= 2000) {
    v.getWalking().turnRunningOn();
}
private void pickUpGrace(){

 if(v.getGroundItem().findNearestRandomized(10, 10, graceId) != null) {
    v.getGroundItem().take(graceId);
    }
}    
GameObject treeLap = v.getGameObject().findNearest(lap_1);
GameObject jumpLap = v.getGameObject().findNearest(lap_2);

//L1 Start
 if (treeLap != null && v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning())) {    
            int treeLapSceneX = treeLap.getSceneMinLocation().getX();
            int treeLapSceneY = treeLap.getSceneMinLocation().getY();
            if(v.getGroundItem().findNearestRandomized(10, 10, graceId) != null) {
            v.getGroundItem().take(graceId);
             }
             else {
                v.invoke("Climb","<col=ffff>Tall tree",lap_1,3,treeLapSceneX,treeLapSceneY,false);

             }
}

//L2
else if (treeLap == null && (currentLocation.equals(post_lap_1)) && v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning())) {
    	log.info("I succeed_2");
            GameObject jumpLap = v.getGameObject().findNearest(lap_2);
            int jumpLapSceneX = jumpLap.getSceneMinLocation().getX();
            int jumpLapSceneY = jumpLap.getSceneMinLocation().getY();
            if(v.getGroundItem().findNearestRandomized(10, 10, graceId) != null) {
            v.getGroundItem().take(graceId);
             }
            else {
            v.invoke("Jump","<col=ffff>Gap",lap_2,opBlock,jumpLapSceneX,jumpLapSceneY,false);
            }
}
//L3
else if (treeLap == null && (currentLocation.equals(post_lap_2) || currentLocation.equals(lap_3_grace)) && v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning()))
{
        	log.info("I succeed_3");
        
            GameObject jumpLap2 = v.getGameObject().findNearest(lap_3);
            int jumpLap2SceneX = jumpLap2.getSceneMinLocation().getX();
            int jumpLap2SceneY = jumpLap2.getSceneMinLocation().getY();
              if(v.getGroundItem().findNearestRandomized(10, 10, graceId) != null) {
            v.getGroundItem().take(graceId);
             }
             else {
            v.invoke("Jump","<col=ffff>Gap",lap_3,opBlock,jumpLap2SceneX,jumpLap2SceneY,false);
            }
}
//L4
else if (treeLap == null && (currentLocation.equals(post_lap_3) || currentLocation.equals(lap_4_grace))&& v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning()))
{
         	log.info("I succeed_4");
        
            GameObject jumpLap3 = v.getGameObject().findNearest(lap_4);
            int jumpLap3SceneX = jumpLap3.getSceneMinLocation().getX();
            int jumpLap3SceneY = jumpLap3.getSceneMinLocation().getY();
             if(v.getGroundItem().findNearestRandomized(10, 10, graceId) != null) {
            v.getGroundItem().take(graceId);
             }
             else {
            v.invoke("Jump","<col=ffff>Gap",lap_4,opBlock,jumpLap3SceneX,jumpLap3SceneY,false);
            }
}
//L5
else if (treeLap == null && (currentLocation.equals(post_lap_4) || currentLocation.equals(lap_5_grace))&& v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning()))
{
        
            log.info("I succeed_5");
            GameObject jumpLap4 = v.getGameObject().findNearest(lap_5);
            int jumpLap4SceneX = jumpLap4.getSceneMinLocation().getX();
            int jumpLap4SceneY = jumpLap4.getSceneMinLocation().getY();
                        if(v.getGroundItem().findNearestRandomized(10, 10, graceId) != null) {
            v.getGroundItem().take(graceId);
             }
             else {
            v.invoke("Jump","<col=ffff>Gap",lap_5,opBlock,jumpLap4SceneX,jumpLap4SceneY,false);
            }
}
//L6
else if (treeLap == null && (currentLocation.equals(post_lap_5) || currentLocation.equals(lap_6_grace))&& v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning()))
{
        
            log.info("I succeed_6");
            GameObject jumpLap5 = v.getGameObject().findNearest(lap_6);
            int jumpLap5SceneX = jumpLap5.getSceneMinLocation().getX();
            int jumpLap5SceneY = jumpLap5.getSceneMinLocation().getY();
            if(v.getGroundItem().findNearestRandomized(10, 10, graceId) != null) {
            v.getGroundItem().take(graceId);
             }
             else {
            v.invoke("Jump","<col=ffff>Gap",lap_6,opBlock,jumpLap5SceneX,jumpLap5SceneY,false);
    }
}
//L7
else if (treeLap == null && (currentLocation.equals(post_lap_6))&& v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning()))
{
        
            log.info("I succeed_7");
            GameObject jumpLap6 = v.getGameObject().findNearest(lap_7);
            int jumpLap6SceneX = jumpLap6.getSceneMinLocation().getX();
            int jumpLap6SceneY = jumpLap6.getSceneMinLocation().getY();
                        if(v.getGroundItem().findNearestRandomized(10, 10, graceId) != null) {
            v.getGroundItem().take(graceId);
             }
             else {
            v.invoke("Jump","<col=ffff>Gap",lap_7,opBlock,jumpLap6SceneX,jumpLap6SceneY,false);
             }
}
//L8
else if (treeLap == null && (currentLocation.equals(post_lap_7))&& v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning()))
{
        
            log.info("I succeed_8");
            GameObject jumpLap7 = v.getGameObject().findNearest(lap_8);
            int jumpLap7SceneX = jumpLap7.getSceneMinLocation().getX();
            int jumpLap7SceneY = jumpLap7.getSceneMinLocation().getY();
            if(v.getGroundItem().findNearestRandomized(10, 10, graceId) != null) {
            v.getGroundItem().take(graceId);
             }
             else {
            v.invoke("Jump","<col=ffff>Gap",lap_8,opBlock,jumpLap7SceneX,jumpLap7SceneY,false);
    }
}

else {
	log.info("I failed");
}

