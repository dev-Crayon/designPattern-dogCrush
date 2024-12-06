/**
 * Synchronized
 * js,ts에는 synchronized 키워드가 없어서 동기화를 위해 Lock을 수동으로 구현
 * Promise, async/await을 사용해 비슷하게 동기화를 구현하긴 했지만,
 * JS 환경에서는 실제 동기화 메커니즘이 없음 ㅋ
 */

class SynchronizedSingleton {
  private static uniqueInstance: SynchronizedSingleton | null = null;
  private static lock: boolean = false;

  private constructor() {}

  public static async getInstance(): Promise<SynchronizedSingleton> {
    while (SynchronizedSingleton.lock) {
      await new Promise((resolve) => setTimeout(resolve, 10)); // Lock이 풀릴 때까지 대기
    }

    SynchronizedSingleton.lock = true; // Lock 설정
    if (!SynchronizedSingleton.uniqueInstance) {
      SynchronizedSingleton.uniqueInstance = new SynchronizedSingleton();
    }
    SynchronizedSingleton.lock = false; // Lock 해제

    return SynchronizedSingleton.uniqueInstance;
  }
}

(async () => {
  const synchronizedInstance1 = await SynchronizedSingleton.getInstance();
  const synchronizedInstance2 = await SynchronizedSingleton.getInstance();

  console.log(
    'SynchronizedSingleton',
    synchronizedInstance1 === synchronizedInstance2
  );
})();

/**
 * Double-Checked Locking
 * volatile 대신 let 사용하여 구현
 * js,ts는 멀티스레드 환경이 아니기 때문에 이러한 이중 검사 방식은 필요 없을듯
 */
class DoubleCheckedLockingSingleton {
  private static uniqueInstance: DoubleCheckedLockingSingleton | null = null;

  private constructor() {}

  public static getInstance(): DoubleCheckedLockingSingleton {
    if (!DoubleCheckedLockingSingleton.uniqueInstance) {
      // 첫 번째 검사
      if (!DoubleCheckedLockingSingleton.uniqueInstance) {
        // 두 번째 검사
        DoubleCheckedLockingSingleton.uniqueInstance =
          new DoubleCheckedLockingSingleton();
      }
    }
    return DoubleCheckedLockingSingleton.uniqueInstance;
  }
}

const dclInstance1 = DoubleCheckedLockingSingleton.getInstance();
const dclInstance2 = DoubleCheckedLockingSingleton.getInstance();
console.log('DoubleCheckedLockingSingleton', dclInstance1 === dclInstance2);

/**
 * 미리 인스턴스를 생성하는 방식
 * 간단하고, 애플리케이션 시작시 인스턴스가 항상 필요할 때 적합하지만,
 * 필요하지 않은 경우에도 인스턴스를 생성한다는 단점이 있음
 */

class EagerSingleton {
  private static uniqueInstance: EagerSingleton = new EagerSingleton();

  private constructor() {}

  public static getInstance(): EagerSingleton {
    return EagerSingleton.uniqueInstance;
  }
}

const eagerInstance1 = EagerSingleton.getInstance();
const eagerInstance2 = EagerSingleton.getInstance();
console.log('EagerSingleton', eagerInstance1 === eagerInstance2);
export {};
