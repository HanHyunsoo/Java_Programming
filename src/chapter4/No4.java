/*
다음 멤버를 가지고 직사각형을 표현하는 Rectangle 클래스를 작성하라.
- int타입의 x, y, width, height 필드: 사각형을 구성하는 점과 크기 정보
- int square(): 사각형 넓이 리턴 
- void show(): 사각형의 좌표와 넓이를 화면에 출력
- boolean contains(Rectangle r): 매개변수로 받는 r이 현 사각형 안에 있으면 true리턴
*/

package chapter4;

public class No4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);
        // 예외가 잘작동하는지 테스트하기위해 checkError인 변수에 Rectangle 클래스를 만든다.
        Rectangle checkError = new Rectangle();
        
        r.show();
        checkError.show();
        System.out.println("s의 면적은 " + s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s을 포함합니다.");
    }
}

class Rectangle {
    int x1, y1, x2, y2, width, height;
    // 현재 클래스가 직사각형을 만족하는지 체크하는 논리형 변수(조건: width > 0, height > 0)
    boolean checkRectangle = false;

    public Rectangle() {
        this(0, 0, 0, 0);
    }

    public Rectangle(int x) {
        this(x, 0, 0, 0);
    }

    public Rectangle(int x, int y) {
        this(x, y, 0, 0);
    }
    
    public Rectangle(int x, int y, int width) {
        this(x, y, width, 0);
    }
    
    // 여기까지는 매개변수가 한개라도 없으면 직사각형을 만족을 못하므로
    // checkRectangle은 false다(기본으로 false로 설정하여 직사각형이면 true로 다시저장).

    public Rectangle(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        x2 = x1 + width - 1;
        y2 = y1 + height - 1;
        this.width = width;
        this.height = height;
        // 가로, 세로의 길이가 0이 넘으면 직사각형이 맞다.
        if(width > 0 && height > 0) checkRectangle = true;
    }
    
    public int square() {
        if(checkRectangle) return width * height;
        else return 0;
    }
    
    public void show() {
        if(checkRectangle){
            System.out.printf("x(%d, %d), y(%d, %d)에서 크기가 %dx%d인 사각형\n", x1, x2, y1, y2, width, height);
        }
        else System.out.println("이 클래스는 직사각형 조건에 만족하지 않습니다.");
    }
    
    public boolean contains(Rectangle r) {
        if(checkRectangle && r.checkRectangle){
            if((x1 < r.x1 && y1 < r.y1) && (r.x2 < x2 && r.y2 < y2)) return true;
            else return false;
        }
        else return false;
    }
}