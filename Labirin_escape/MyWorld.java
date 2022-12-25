import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public static int scorePlayer = 0;
    public static int lives = 3;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
        showScore();
        showLives();
    }
    
    public void act() {
        showLives();
        showScore();
        if(showGameOver()) {
            GameOver gameover = new GameOver();
            removeObjects(getObjects(null));
            addObject(gameover, getWidth()/2, getHeight()/2);
            if(Greenfoot.isKeyDown("space")) {
                Greenfoot.setWorld(new MyWorld());
            }
        }
    }
    
    public void showLives() {
        showText("Lives: " + lives, 200, 10);
    }
    
    public void showScore() {
        showText("Score: " + scorePlayer, 100, 10);
    }
    
    public boolean showGameOver() {
        if(lives == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void prepare()
    {
        scorePlayer = 0;
        lives = 3;
        // Wall kiri

        Wall2 wall2 = new Wall2();
        addObject(wall2,14,584);
        Wall2 wall22 = new Wall2();
        addObject(wall22,14,584-30);
        Wall2 wall23 = new Wall2();
        addObject(wall23,14,584-30*2);
        Wall2 wall24 = new Wall2();
        addObject(wall24,14,584-30*3);
        Wall2 wall25 = new Wall2();
        addObject(wall25,14,584-30*4);
        Wall2 wall26 = new Wall2();
        addObject(wall26,14,584-30*5);
        Wall2 wall27 = new Wall2();
        addObject(wall27,14,584-30*6);
        Wall2 wall28 = new Wall2();
        addObject(wall28,14,584-30*7);
        Wall2 wall29 = new Wall2();
        addObject(wall29,14,584-30*8);
        Wall2 wall210 = new Wall2();
        addObject(wall210,14,584-30*9);
        Wall2 wall211 = new Wall2();
        addObject(wall211,14,584-30*10);
        Wall2 wall212 = new Wall2();
        addObject(wall212,14,584-30*11);
        Wall2 wall213 = new Wall2();
        addObject(wall213,14,584-30*12);
        Wall2 wall214 = new Wall2();
        addObject(wall214,14,584-30*13);
        Wall2 wall215 = new Wall2();
        addObject(wall215,14,584-30*14);
        Wall2 wall216 = new Wall2();
        addObject(wall216,14,584-30*15);
        Wall2 wall217 = new Wall2();
        addObject(wall217,14,584-30*16);
        Wall2 wall218 = new Wall2();
        addObject(wall218,14,584-30*17);
        Wall2 wall219 = new Wall2();
        addObject(wall219,14,584-30*18);
        Wall2 wall220 = new Wall2();
        addObject(wall220,14,584-30*19);

        //Wall atas
        Wall2 wall221 = new Wall2();
        addObject(wall221,43,14);
        Wall2 wall222 = new Wall2();
        addObject(wall222,43+30,14);
        Wall2 wall223 = new Wall2();
        addObject(wall223,43+30*2,14);
        Wall2 wall224 = new Wall2();
        addObject(wall224,43+30*3,14);
        Wall2 wall225 = new Wall2();
        addObject(wall225,43+30*4,14);
        Wall2 wall226 = new Wall2();
        addObject(wall226,43+30*5,14);
        Wall2 wall227 = new Wall2();
        addObject(wall227,43+30*6,14);
        Wall2 wall228 = new Wall2();
        addObject(wall228,43+30*7,14);
        Wall2 wall229 = new Wall2();
        addObject(wall229,43+30*8,14);
        Wall2 wall230 = new Wall2();
        addObject(wall230,43+30*9,14);
        Wall2 wall231 = new Wall2();
        addObject(wall231,43+30*10,14);
        Wall2 wall232 = new Wall2();
        addObject(wall232,43+30*11,14);
        Wall2 wall233 = new Wall2();
        addObject(wall233,43+30*12,14);
        Wall2 wall234 = new Wall2();
        addObject(wall234,43+30*13,14);
        Wall2 wall235 = new Wall2();
        addObject(wall235,43+30*14,14);
        Wall2 wall236 = new Wall2();
        addObject(wall236,43+30*15,14);
        Wall2 wall237 = new Wall2();
        addObject(wall237,43+30*16,14);
        Wall2 wall238 = new Wall2();
        addObject(wall238,43+30*17,14);
        Wall2 wall239 = new Wall2();
        addObject(wall239,43+30*18,14);
        Wall2 wall240 = new Wall2();
        addObject(wall240,43+30*19,14);

        //Wall kanan
        Wall2 wall241 = new Wall2();
        addObject(wall241,585,45);
        Wall2 wall242 = new Wall2();
        addObject(wall242,585,45+30);
        Wall2 wall243 = new Wall2();
        addObject(wall243,585,45+30*2);
        Wall2 wall244 = new Wall2();
        addObject(wall244,584,45+30*3);
        Wall2 wall245 = new Wall2();
        addObject(wall245,584,45+30*4);
        Wall2 wall246 = new Wall2();
        addObject(wall246,584,45+30*5);
        Wall2 wall247 = new Wall2();
        addObject(wall247,584,45+30*6);
        Wall2 wall248 = new Wall2();
        addObject(wall248,584,45+30*7);
        Wall2 wall249 = new Wall2();
        addObject(wall249,584,45+30*8);
        Wall2 wall250 = new Wall2();
        addObject(wall250,584,45+30*9);
        Wall2 wall251 = new Wall2();
        addObject(wall251,584,45+30*10);
        Wall2 wall252 = new Wall2();
        addObject(wall252,584,45+30*11);
        Wall2 wall253 = new Wall2();
        addObject(wall253,584,45+30*12);
        Wall2 wall254 = new Wall2();
        addObject(wall254,584,45+30*13);
        Wall2 wall255 = new Wall2();
        addObject(wall255,584,45+30*14);
        Wall2 wall256 = new Wall2();
        addObject(wall256,584,45+30*15);
        Wall2 wall257 = new Wall2();
        addObject(wall257,584,45+30*16);
        Wall2 wall258 = new Wall2();
        addObject(wall258,584,45+30*17);
        Wall2 wall259 = new Wall2();
        addObject(wall259,584,45+30*18);

        //Wall bawah

        Wall2 wall260 = new Wall2();
        addObject(wall260,14+30*4,584);
        Wall2 wall261 = new Wall2();
        addObject(wall261,14+30*5,584);
        Wall2 wall262 = new Wall2();
        addObject(wall262,14+30*5,584);
        Wall2 wall263 = new Wall2();
        addObject(wall263,14+30*6,584);
        Wall2 wall264 = new Wall2();
        addObject(wall264,14+30*7,584);
        Wall2 wall265 = new Wall2();
        addObject(wall265,14+30*8,584);
        Wall2 wall266 = new Wall2();
        addObject(wall266,14+30*9,584);
        Wall2 wall267 = new Wall2();
        addObject(wall267,14+30*10,584);
        Wall2 wall268 = new Wall2();
        addObject(wall268,14+30*11,584);
        Wall2 wall269 = new Wall2();
        addObject(wall269,14+30*12,584);
        Wall2 wall270 = new Wall2();
        addObject(wall270,14+30*13,584);
        Wall2 wall271 = new Wall2();
        addObject(wall271,14+30*14,584);
        Wall2 wall272 = new Wall2();
        addObject(wall272,14+30*15,584);
        Wall2 wall273 = new Wall2();
        addObject(wall273,14+30*16,584);
        Wall2 wall274 = new Wall2();
        addObject(wall274,14+30*17,584);
        Wall2 wall275 = new Wall2();
        addObject(wall275,14+30*18,584);

        Doors doors = new Doors();
        addObject(doors,521,61);

        //Wall dekat Player

        Wall2 wall276 = new Wall2();
        addObject(wall276,134,553);
        Wall2 wall277 = new Wall2();
        addObject(wall277,134,553-30);
        Wall2 wall278 = new Wall2();
        addObject(wall278,134,553-30*2);
        Wall2 wall279 = new Wall2();
        addObject(wall279,134,553-30*3);

        Wall2 wall280 = new Wall2();
        addObject(wall280,134+30,553-30*3);
        Wall2 wall281 = new Wall2();
        addObject(wall281,134+30,553-30*3);
        Wall2 wall282 = new Wall2();
        addObject(wall282,134+30*2,553-30*3);
        Wall2 wall283 = new Wall2();
        addObject(wall283,134+30*3,553-30*3);
        Wall2 wall284 = new Wall2();
        addObject(wall284,134+30*4,553-30*3);
        Wall2 wall285 = new Wall2();
        addObject(wall285,134+30*5,553-30*3);

        Wall2 wall286 = new Wall2();
        addObject(wall286,134+30*5,553);
        Wall2 wall287 = new Wall2();
        addObject(wall287,134+30*5,553-30);
        Wall2 wall288 = new Wall2();
        addObject(wall288,134+30*5,553-30*2);

        Wall2 wall289 = new Wall2();
        addObject(wall289,134+30*4,553);
        Wall2 wall290 = new Wall2();
        addObject(wall290,134+30*3,553);
        Wall2 wall291 = new Wall2();
        addObject(wall291,134+30*2,553);
        Wall2 wall292 = new Wall2();
        addObject(wall292,134+30,553);

        Wall2 wall293 = new Wall2();
        addObject(wall293,134+30,553-30);
        Wall2 wall294 = new Wall2();
        addObject(wall294,134+30*2,553-30);
        Wall2 wall295 = new Wall2();
        addObject(wall295,134+30*3,553-30);
        Wall2 wall296 = new Wall2();
        addObject(wall296,134+30*4,553-30);

        Wall2 wall297 = new Wall2();
        addObject(wall297,134+30,553-30*2);
        Wall2 wall298 = new Wall2();
        addObject(wall298,134+30*2,553-30*2);
        Wall2 wall299 = new Wall2();
        addObject(wall299,134+30*3,553-30*2);
        Wall2 wall300 = new Wall2();
        addObject(wall300,134+30*4,553-30*2);

        Wall2 wall301 = new Wall2();
        addObject(wall301,44,344);
        Wall2 wall302 = new Wall2();
        addObject(wall302,44+30,344);
        Wall2 wall303 = new Wall2();
        addObject(wall303,44+30*2,344);
        Wall2 wall304 = new Wall2();
        addObject(wall304,44+30*3,344);
        Wall2 wall305 = new Wall2();
        addObject(wall305,44+30*4,344);
        Wall2 wall306 = new Wall2();
        addObject(wall306,44+30*5,344);
        Wall2 wall307 = new Wall2();
        addObject(wall307,44+30*6,344);
        Wall2 wall308 = new Wall2();
        addObject(wall308,44+30*7,344);
        Wall2 wall309 = new Wall2();
        addObject(wall309,44+30*8,344);
        Wall2 wall310 = new Wall2();
        addObject(wall310,44+30*9,344);
        Wall2 wall311 = new Wall2();
        addObject(wall311,44+30*10,344);
        Wall2 wall312 = new Wall2();
        addObject(wall312,44+30*11,344);
        Wall2 wall313 = new Wall2();
        addObject(wall313,44+30*12,344);
        Wall2 wall314 = new Wall2();
        addObject(wall314,44+30*13,344);
        Wall2 wall315 = new Wall2();
        addObject(wall315,44+30*14,344);
        Wall2 wall316 = new Wall2();
        addObject(wall316,44+30*15,344);

        Wall2 wall317 = new Wall2();
        addObject(wall317,44,344-30);
        Wall2 wall318 = new Wall2();
        addObject(wall318,44+30,344-30);
        Wall2 wall319 = new Wall2();
        addObject(wall319,44+30*2,344-30);
        Wall2 wall320 = new Wall2();
        addObject(wall320,44+30*3,344-30);
        Wall2 wall321 = new Wall2();
        addObject(wall321,44+30*4,344-30);
        Wall2 wall322 = new Wall2();
        addObject(wall322,44+30*5,344-30);
        Wall2 wall323 = new Wall2();
        addObject(wall323,44+30*6,344-30);
        Wall2 wall324 = new Wall2();
        addObject(wall324,44+30*7,344-30);
        Wall2 wall325 = new Wall2();
        addObject(wall325,44+30*8,344-30);
        Wall2 wall326 = new Wall2();
        addObject(wall326,44+30*9,344-30);
        Wall2 wall327 = new Wall2();
        addObject(wall327,44+30*10,344-30);
        Wall2 wall328 = new Wall2();
        addObject(wall328,44+30*11,344-30);
        Wall2 wall329 = new Wall2();
        addObject(wall329,44+30*12,344-30);
        Wall2 wall330 = new Wall2();
        addObject(wall330,44+30*13,344-30);
        Wall2 wall331 = new Wall2();
        addObject(wall331,44+30*14,344-30);
        Wall2 wall332 = new Wall2();
        addObject(wall332,44+30*15,344-30);

        Wall2 wall333 = new Wall2();
        addObject(wall333,554,195);
        Wall2 wall334 = new Wall2();
        addObject(wall334,554-30,195);
        Wall2 wall335 = new Wall2();
        addObject(wall335,554-30*2,195);
        Wall2 wall336 = new Wall2();
        addObject(wall336,554-30*3,195);
        Wall2 wall337 = new Wall2();
        addObject(wall337,554-30*4,195);
        Wall2 wall338 = new Wall2();
        addObject(wall338,554-30*5,195);
        Wall2 wall339 = new Wall2();
        addObject(wall339,554-30*6,195);
        Wall2 wall340 = new Wall2();
        addObject(wall340,554-30*7,195);
        Wall2 wall341= new Wall2();
        addObject(wall341,554-30*8,195);
        Wall2 wall342 = new Wall2();
        addObject(wall342,554-30*9,195);
        Wall2 wall343 = new Wall2();
        addObject(wall343,554-30*10,195);
        Wall2 wall344 = new Wall2();
        addObject(wall344,554-30*11,195);
        Wall2 wall345 = new Wall2();
        addObject(wall345,554-30*12,195);
        Wall2 wall346 = new Wall2();
        addObject(wall346,554-30*13,195);
        Wall2 wall347 = new Wall2();
        addObject(wall347,554-30*14,195);
        Wall2 wall348 = new Wall2();
        addObject(wall348,554-30*15,195);

        Wall2 wall349 = new Wall2();
        addObject(wall349,554,195-30);
        Wall2 wall350 = new Wall2();
        addObject(wall350,554-30,195-30);
        Wall2 wall351 = new Wall2();
        addObject(wall351,554-30*2,195-30);
        Wall2 wall352 = new Wall2();
        addObject(wall352,554-30*3,195-30);
        Wall2 wall353 = new Wall2();
        addObject(wall353,554-30*4,195-30);
        Wall2 wall354 = new Wall2();
        addObject(wall354,554-30*5,195-30);
        Wall2 wall355 = new Wall2();
        addObject(wall355,554-30*6,195-30);
        Wall2 wall356 = new Wall2();
        addObject(wall356,554-30*7,195-30);
        Wall2 wall357 = new Wall2();
        addObject(wall357,554-30*8,195-30);
        Wall2 wall358 = new Wall2();
        addObject(wall358,554-30*9,195-30);
        Wall2 wall359 = new Wall2();
        addObject(wall359,554-30*10,195-30);
        Wall2 wall360 = new Wall2();
        addObject(wall360,554-30*11,195-30);
        Wall2 wall361 = new Wall2();
        addObject(wall361,554-30*12,195-30);
        Wall2 wall362 = new Wall2();
        addObject(wall362,554-30*13,195-30);
        Wall2 wall363 = new Wall2();
        addObject(wall363,554-30*14,195-30);
        Wall2 wall364 = new Wall2();
        addObject(wall364,554-30*15,195-30);

        P1 player = new P1();
        addObject(player, 70, 570);
        Coin coin = new Coin();
        addObject(coin,72,442);
        Coin coin2 = new Coin();
        addObject(coin2,344,528);
        Coin coin3 = new Coin();
        addObject(coin3,530,237);
        Coin coin4 = new Coin();
        addObject(coin4,292,89);
        Thorns thorns = new Thorns();
        addObject(thorns,166,394);
    }
}
