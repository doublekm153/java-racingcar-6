package racingcar;

public class Car {
  private final String name;

  public Car(String name) {
    validateName(name);
    this.name = name;
  }

  private void validateName(String name) {
    if (name.length() > 5) {
      throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다.");
    }
  }
}