from base_algorithm.abstract_algorithm import AbstractAlgorithm


class BinaryGap(AbstractAlgorithm):
    def solution(self, N, debug):
        return len(max( "{0:b}".format(N).strip('0').split('1')))

    def execute(self):
        self.process(9, 2)
        self.process(529, 4)
        self.process(20, 1)
