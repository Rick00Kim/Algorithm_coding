def execute_algo(dict_function):
    for i, f in dict_function.items():
        print('{0} -> {1}'.format(i, f.__class__.__name__))

    user_in = str(input('Function -> '))

    if user_in in dict_function.keys():
        dict_function[user_in].execute()
    else:
        print('Not available...')
