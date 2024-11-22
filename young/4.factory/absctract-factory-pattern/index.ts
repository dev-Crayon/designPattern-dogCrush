import { SportsCarPartsFactory } from './factories/sportsCarPartsFactory';
import { TruckPartsFactory } from './factories/truckPartsFactory';
import { CarPartsFactory } from './interfaces/carPartsFactory.interface';

function getCarParts(factory: CarPartsFactory) {
  const engine = factory.createEngine();
  const tire = factory.createTire();

  engine.start();
  tire.inflate();
}

// 스포츠카 부품 팩토리 사용
console.log('스포츠카 부품:');
getCarParts(new SportsCarPartsFactory());

// 트럭 부품 팩토리 사용
console.log('트럭 부품:');
getCarParts(new TruckPartsFactory());
