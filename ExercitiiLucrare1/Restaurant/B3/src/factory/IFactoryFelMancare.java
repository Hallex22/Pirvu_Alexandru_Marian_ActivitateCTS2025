package factory;

import clase.FelMancare;

public interface IFactoryFelMancare {
    FelMancare getFelMancare(IFeluriMancare felMancare, int extra);
}
