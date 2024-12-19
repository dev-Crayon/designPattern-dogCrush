class BasicSingleton {
  // 유일한 인스턴스를 저장할 private 정적 변수
  private static uniqueInstance: BasicSingleton;

  // 외부에서 생성자를 호출하지 못하도록 private으로 선언
  private constructor() {}

  // 인스턴스를 생성하거나 반환하는 메서드
  public static getInstance(): BasicSingleton {
    if (!BasicSingleton.uniqueInstance) {
      BasicSingleton.uniqueInstance = new BasicSingleton();
    }
    return BasicSingleton.uniqueInstance;
  }
}

const instance1 = BasicSingleton.getInstance();
const instance2 = BasicSingleton.getInstance();
console.log(instance1 === instance2);
