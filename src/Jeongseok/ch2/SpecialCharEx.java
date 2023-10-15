package Jeongseok.ch2;

class SpecialCharEx {
    public static void main(String[] args) {
        System.out.println('\'');               // ''' 입력 시 오류 발생
        System.out.println("abc\t123\b456");    // \b에 의해 3이 삭제
        System.out.println('\n');               // 개행 문자 출력 후 개행
        System.out.println("\"Hello\"");        // 큰따옴표 출력
        System.out.println("c:\\");
    }
}