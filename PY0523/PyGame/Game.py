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

# 게임 루프
running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    # 배경 색상 설정
    screen.fill(WHITE)

    # 여기에 게임 로직 및 그리기 코드를 작성합니다.
    # 예제로 원 그리기
    pygame.draw.circle(screen, BLACK, (screen_width // 2, screen_height // 2), 50)

    # 화면 업데이트
    pygame.display.update()

# 게임 종료
pygame.quit()
sys.exit()
