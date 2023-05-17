import tkinter as tk
from datetime import datetime, timedelta

class CountdownTimer:
    def __init__(self, master):
        self.master = master
        master.geometry("300x250")
        master.title("남은 시간 계산기")

        # 시간 입력창
        self.input_label = tk.Label(master, text="시간 입력 (yyyy-mm-dd hh:mm:ss): ", font=("Arial", 14))
        self.input_label.pack(pady=5)
        self.input_entry = tk.Entry(master, font=("Arial", 20))
        self.input_entry.pack(pady=10)

        # 남은 시간 라벨
        self.time_label = tk.Label(master, font=("Arial", 40), text="")
        self.time_label.pack(pady=10)

        # 시작 버튼
        self.start_button = tk.Button(master, text="시작", font=("Arial", 14), command=self.start_countdown)
        self.start_button.pack(pady=10)

        # 종료 버튼
        self.stop_button = tk.Button(master, text="종료", font=("Arial", 14), command=self.stop_countdown, state=tk.DISABLED)
        self.stop_button.pack(pady=10)

        # 타이머
        self.timer = None

    def start_countdown(self):
        # 입력한 시간이 올바른 형식인지 확인
        input_time_str = self.input_entry.get()
        try:
            input_time = datetime.strptime(input_time_str, "%Y-%m-%d %H:%M:%S")
        except ValueError:
            self.time_label.config(text="올바른 날짜 형식을 입력해주세요.")
            return

        # 기존 타이머가 있으면 중지
        if self.timer is not None:
            self.master.after_cancel(self.timer)

        # 남은 시간 계산
        time_remaining = input_time - datetime.now()
        if time_remaining.total_seconds() <= 0:
            self.time_label.config(text="입력한 시간이 이미 지났습니다.")
            return
        time_remaining_str = str(timedelta(seconds=time_remaining.total_seconds()))
        self.time_label.config(text=time_remaining_str)

        # 타이머 시작
        self.stop_button.config(state=tk.NORMAL)
        self.start_button.config(state=tk.DISABLED)
        self.timer = self.master.after(1000, self.countdown, time_remaining)

    def countdown(self, time_remaining):
        time_remaining -= timedelta(seconds=1)
        if time_remaining.total_seconds() <= 0:
            self.time_label.config(text="타이머 종료")
            self.stop_button.config(state=tk.DISABLED)
            self.start_button.config(state=tk.NORMAL)
            self.timer = None
        else:
            time_remaining_str = str(timedelta(seconds=time_remaining.total_seconds()))
            self.time_label.config(text=time_remaining_str)
            self.timer = self.master.after(1000, self.countdown, time_remaining)

    def stop_countdown(self):
        self.master.after_cancel(self.timer)
        self.time_label.config(text="")
        self.stop_button.config(state=tk.DISABLED)
        self.start_button.config(state=tk.NORMAL)
        self.timer = None


if __name__ == '__main__':
    root = tk.Tk()
    countdown_timer = CountdownTimer(root)
    root.mainloop()
