from .utility import *
from .codility.index import Codility
from .leetcode.index import LeetCode


def executor():

    func_dict = {
        '1': Codility(),
        '2': LeetCode(),
    }

    execute_algo(func_dict)


if __name__ == "__main__":
    executor()
