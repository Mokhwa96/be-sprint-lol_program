package src.com.codestates.seb.lol_program;

import java.util.Scanner;

public class LOL_Program {
  public static void main(String[] args) {
    //TODO:
    System.out.println("[안내] TRPG 스타크래프트 시작합니다.");
    System.out.println("[안내] 자신의 유닛 정보를 입력해 주세요.");
    LoL_char me = new LoL_char();
    String[] me_info = me.user_create();
    me.user_info(me_info[0],me_info[1],me_info[2],me_info[3]);
    me.user_print(me_info);
    System.out.println("========================================");
    System.out.println("[안내] 상대의 유닛 정보를 입력해 주세요.");
    LoL_char enemy = new LoL_char();
    String[] enemy_info = enemy.user_create();
    me.user_info(enemy_info[0],enemy_info[1],enemy_info[2],enemy_info[3]);
    me.user_print(enemy_info);
    int [] A = me.user_info_int(me_info);
    int [] B = enemy.user_info_int(enemy_info);
    System.out.println("========================================");
    me.attack(A,B);
    while (B[2] < 0);{
      me.attack(A,B);
    }
    System.out.println("========================================");
  }
}