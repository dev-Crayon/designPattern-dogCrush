# 팩토리 패턴

‘new’ 연산자를 사용하면 구상 클래스의 인스턴스가 만들어짐. 이런 구상 클래스를 바탕으로 개발을 하면 나중에 코드를 수정해야할 가능성이 커지고 유연성이 떨어짐

```tsx
// 부모 클래스
class Duck {
  public swim() {
    console.log('Duck is swimming');
  }
}

// 구상 클래스들
class MallardDuck extends Duck {
  public quack() {
    console.log('MallardDuck is quacking');
  }
}

class HuntingDuck extends Duck {
  public hunt() {
    console.log('HuntingDuck is hunting');
  }
}

class BathDuck extends Duck {
  public float() {
    console.log('BathDuck is floating in the bathtub');
  }
}

// 클라이언트 코드
let duck: Duck;

let picnic = false;
let hunting = true;
let inBathTub = false;

if (picnic) {
  duck = new MallardDuck();
} else if (hunting) {
  duck = new HuntingDuck();
} else if (inBathTub) {
  duck = new BathDuck();
}
```

하지만 인터페이스에 맞춰 코딩하면 시스템에서 일어날 수 있는 여러 변화에 대응할 수 있다

인터페이스를 바탕으로 만들어진 코드는 어떤 클래스든 특정 인터페이스만 구현하면 사용할 수 있기 때문. 즉 **다형성** 덕분

반대로 구상 클래스를 많이 사용하면 새로운 구상 클래스가 추가될 때마다 코드를 고쳐야 하므로 수많은 문제가 생긴다. 즉 **변경에 닫혀있는 코드**가 되어 **OCP원칙을 어기는 것**

그렇기에 바뀌는 부분을 찾아내서 바뀌지 않는 부분과 분리해야한다!

이렇게 객체 생성 로직에 생기는 문제를 해결하기 위해 사용하는 것이 팩토리 패턴!

**팩토리 패턴**은 객체 생성 로직을 캡슐화하여 객체 생성 과정에서 복잡한 논리를 숨기고, 클라이언트 코드가 객체 생성에 대한 의존성을 줄이는 데 도움을 주는 디자인 패턴 이다

여기서 구상 클래스의 의존성을 줄이는 것은 객체지향 디자인의 원칙인 **의존성 뒤집기 원칙** 을 지키는 것과 같다

즉, 구상 클래스가 아닌 추상화된 것에 의존하게 하는것

팩토리 패턴은 크게 두가지로 나뉜다

## 팩토리 메소드 패턴

팩토리 메소드 패턴은 **서브클래스**에서 어떤 클래스를 만들지 결정함으로써 객체 생성을 캡슐화 함

객체를 생성할 때 필요한 인터페이스를 만들고, 어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정한다.

즉, 팩토리 메소드 패턴을 사용하면 클래스 인스턴스를 만드는 일을 서브클래스에 맡기게 되는 것

**사용하는 서브클래스에 따라 생산되는 객체 인스턴스가 결정된다!**

```tsx
interface Car {
  drive(): void;
}

// 스포츠카
class SportsCar implements Car {
  drive() {
    console.log('스포츠카를 운전 중');
  }
}

// 트럭
class Truck implements Car {
  drive() {
    console.log('트럭을 운전 중');
  }
}

// 세단
class Sedan implements Car {
  drive() {
    console.log('세단을 운전 중');
  }
}

// 자동차 팩토리
class CarFactory {
  static createCar(type: string): Car {
    if (type === 'sports') {
      return new SportsCar();
    } else if (type === 'truck') {
      return new Truck();
    } else if (type === 'sedan') {
      return new Sedan();
    } else {
      throw new Error('알 수 없는 자동차 종류입니다.');
    }
  }
}

const myCar = CarFactory.createCar('sports');
myCar.drive();
```

## 추상 팩토리 패턴

추상 팩토리는 제품군을 위한 인터페이스를 제공한다

구상 클래스에 의존하지 않고도 서로 연관되거나 의존적인 객체로 이루어진 제품군을 생산하는 인터페이스를 제공하고, 구상 클래스는 서브클래스에서 만든다.

추상 팩토리 패턴을 사용하면 클라이언트에서 추상 인터페이스로 일련의 제품을 공급받을 수 있다. 이떄 실제로 어떤 제품이 생산되는지는 전혀 알 필요가 없다. 즉, 클라이언트와 팩토리에서 생산되는 제품을 분리할 수 있다

## 팩토리 메서드 vs 추상 팩토리

토리 메소드 패턴은 **단일 객체 생성**에 초점을 맞추는 반면, 추상 팩토리 패턴은 **제품군**을 생성하고 관리

| **구분**          | **팩토리 메소드**                                | **추상 팩토리**                                        |
| ----------------- | ------------------------------------------------ | ------------------------------------------------------ |
| **목적**          | 단일 객체 생성.                                  | 관련된 객체 그룹 생성.                                 |
| **구조**          | 하나의 객체 생성을 위한 메소드를 제공.           | 여러 관련 객체 생성 메소드를 포함하는 인터페이스 제공. |
| **확장성**        | 새로운 제품을 추가하려면 새로운 서브클래스 추가. | 새로운 제품군을 추가하려면 팩토리 및 제품 구현 필요.   |
| **적용 시나리오** | 특정 객체를 생성하는 작업을 캡슐화.              | 서로 관련된 객체군을 일관성 있게 생성.                 |
