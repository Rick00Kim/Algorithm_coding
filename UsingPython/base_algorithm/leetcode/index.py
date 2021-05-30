from base_algorithm.utility import execute_algo
from .two_sum import TwoSum
from .add_two_numbers import AddTwoNumbers


class LeetCode:
    def __init__(self) -> None:
        self.algorithm_list = {
            1: TwoSum(),
            2: AddTwoNumbers(),
        }

    def execute(self) -> None:
        execute_algo(self.algorithm_list)
