package com.effective.item70;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

// ####################################################################################
// 복구할 수 있는 상황에는 검사 예외를, 프로그래밍 오류에는 런타임 예외를 사용하라
// ####################################################################################

/*
 FileInputStream 클래스는 객체를 생성할때 내부적으로 파일 경로가 올바른지 검사하는 로직이 들어있다.

        if (file.isInvalid()) {
            throw new FileNotFoundException("Invalid file path");
        }

  왜냐하면 사용자가 불러온 파일 이름이나 경로가 잘못 되었을 경우
  사실 FileInputStream 에서는 문제를 해결할 방법이 딱히 없다.

  문제를 해결하기 위해서는 FileInputStream 를 호출한 클래스쪽으로 Exception(Checked Exception)을 던지면
  클라이언트는 Exception을 받아서 문제를 해결한다.
 */
public class Item70 {

  public static void main(String[] args) {
    checkedExceptionWithThrows();
  }

  private static void checkedExceptionWithThrows() {
    File file = new File("not_existing_file.txt");
    try {
      FileInputStream stream = new FileInputStream(file);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }
}