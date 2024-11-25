import { CarPartsFactory } from '../interfaces/carPartsFactory.interface';
import { Engine } from '../interfaces/engine.interface';
import { Tire } from '../interfaces/tire.interface';
import { TruckEngine } from '../products/truckEngine';
import { TruckTire } from '../products/truckTire';

export class TruckPartsFactory implements CarPartsFactory {
  createEngine(): Engine {
    return new TruckEngine();
  }

  createTire(): Tire {
    return new TruckTire();
  }
}
