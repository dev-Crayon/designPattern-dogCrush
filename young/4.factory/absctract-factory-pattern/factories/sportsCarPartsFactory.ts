import { CarPartsFactory } from '../interfaces/carPartsFactory.interface';
import { Engine } from '../interfaces/engine.interface';
import { Tire } from '../interfaces/tire.interface';
import { SportsCarEngine } from '../products/sportsCarEngine';
import { SportsCarTire } from '../products/sportsCarTire';

export class SportsCarPartsFactory implements CarPartsFactory {
  createEngine(): Engine {
    return new SportsCarEngine();
  }

  createTire(): Tire {
    return new SportsCarTire();
  }
}
