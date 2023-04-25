// import java.applet.*;
// import java.awt.*;
// import java.awt.event.*;
// public class counter extends Applet implements FocusListener {
//     int focusCounter = 0;
//     int initCounter = 0;
//     int startCounter = 0;
//     int stopCounter = 0;
//     int destroyCounter = 0;
//     public void init() {
//         initCounter++;
//         addFocusListener(this);  
//     }
//     public void start() {
//         startCounter++;  
//     }
//     public void stop() {
//         stopCounter++;  
//     }
//     public void destroy() {
//         destroyCounter++;
//     }
//     public void focusGained(FocusEvent e) {
//         focusCounter++;
//     }
//     public void focusLost(FocusEvent e) {
//     }
//     public void paint(Graphics g) {
//         g.drawString("Init method called " + initCounter + " times.", 10, 30);
//         g.drawString("Start method called " + startCounter + " times.", 10, 50);
//         g.drawString("Stop method called " + stopCounter + " times.", 10, 70);
//         g.drawString("Destroy method called " + destroyCounter + " times.", 10, 90);
//         g.drawString("Applet in focus " + focusCounter + " times.", 10, 100);
//     }
// }
// /*
//  * <applet code ="counter" width=600 height=600>
//  * </applet>
//  */