import numpy as np
import matplotlib.pyplot as plt
from scipy.integrate import quad

# 적분할 함수 정의
# def f(x):
#     return np.sin(x)
def f(x):
    return np.sin(x)

# 적분 구간 정의
a = 0

# b = 2 * np.pi
b = np.pi

# x의 값을 준비
x = np.linspace(0, 2*np.pi, 100)
y = f(x)

# 사인파 그리기
plt.plot(x, y, label="y=sin(x)")

# 적분 영역 시각화
ix = np.linspace(a, b)
iy = f(ix)
verts = [(a, 0), *zip(ix, iy), (b, 0)]
poly = plt.Polygon(verts, alpha=0.2)
plt.gca().add_patch(poly)

# 적분 계산
#integral, error = quad(f, a, b)
integral = quad(f, 0, 5)
print(integral)
#plt.text(0.5 * (a + b), 0.5, f"integral = {integral:.2f}", horizontalalignment='center', fontsize=15)

plt.legend()
plt.show()