from base_algorithm.utility import execute_algo
from .binary_gap import BinaryGap
from .cyclic_rotation import CyclicRotation


class Codility:
    def __init__(self) -> None:
        self.algorithm_list = {
            '1': BinaryGap(),
            '2': CyclicRotation(),
        }

    def execute(self) -> None:
        for i, f in self.algorithm_list.items():
            print('{0} -> {1}'.format(i, f.__class__.__name__))

        user_in = str(input('Function -> '))

        if user_in in self.algorithm_list.keys():
            self.algorithm_list[user_in].execute()
        else:
            print('Not available...')
