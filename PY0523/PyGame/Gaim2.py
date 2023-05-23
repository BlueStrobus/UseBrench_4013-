import pygame
import sys

# 초기화
pygame.init()

# 화면 크기 설정
screen_width = 800
screen_height = 600
screen = pygame.display.set_mode((screen_width, screen_height))
pygame.display.set_caption("파이게임 예제")

# 색상 설정
BLACK = (0, 0, 0)
WHITE = (255, 255, 255)

# 사각형 초기 위치
rect_x = screen_width // 2
rect_y = screen_height // 2
rect_width = 50
rect_height = 50

# 게임 루프
running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    # 배경 색상 설정
    screen.fill(WHITE)

    # 마우스 위치 가져오기
    mouse_x, mouse_y = pygame.mouse.get_pos()

    # 사각형 이동
    rect_x += (mouse_x - rect_x) * 0.1
    rect_y += (mouse_y - rect_y) * 0.1

    # 사각형 그리기
    pygame.draw.rect(screen, BLACK, (rect_x, rect_y, rect_width, rect_height))

    # 화면 업데이트
    pygame.display.update()

# 게임 종료
pygame.quit()
sys.exit()
