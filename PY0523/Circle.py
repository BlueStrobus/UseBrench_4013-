# import numpy as np
# import matplotlib.pyplot as plt
# from scipy.integrate import quad

# r = float(input("원의 반지름을 입력하세요: "))
# v = r * r * 3.14
# print("원의 넓이는 " + str(v) + "입니다.")


import math
import matplotlib.pyplot as plt

def calculate_circle_area(radius):
    area = math.pi * radius ** 2
    return area

radius = float(input("원의 반지름을 입력하세요: "))
area = calculate_circle_area(radius)
print("원의 넓이:", area)

radii = list(range(1, 11))
areas = [calculate_circle_area(radius) for radius in radii]

plt.plot(radii, areas)
plt.xlabel('반지름')
plt.ylabel('넓이')
plt.title('원의 넓이')
plt.show()
