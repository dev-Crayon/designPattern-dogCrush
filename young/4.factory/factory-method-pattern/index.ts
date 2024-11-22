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
