def loop_steps(rem, subject_number):
    return (rem * subject_number) % 20201227


def apply_secret_loop(loop, subject_number):
    i = 0
    remainder = 1
    while i != loop:
        remainder = loop_steps(remainder, subject_number)
        i += 1
    return remainder


def find_secret_loop(target, subject_number):
    i = 0
    remainder = 1
    while remainder != target:
        remainder = loop_steps(remainder, subject_number)
        i += 1
    return i


def solution1(target1, target2):
    loop1 = find_secret_loop(target1, 7)
    loop2 = find_secret_loop(target2, 7)
    print(f"loop1:{loop1} | loop2:{loop2}")
    enc_key1 = apply_secret_loop(loop2, target1)
    enc_key2 = apply_secret_loop(loop1, target2)
    print(f"{enc_key1 == enc_key2} | {enc_key1} - {enc_key2}")


# solution1(5764801, 17807724)
solution1(9717666, 20089533)
