import folium
import matplotlib.pyplot as plt
import seaborn as sns
import webbrowser
import requests
import json

# 서울 행정구역 json raw파일(githubcontent)
r = requests.get('https://raw.githubusercontent.com/southkorea/seoul-maps/master/kostat/2013/json/seoul_municipalities_geo_simple.json')
c = r.content
seoul_geo = json.loads(c)
m = folium.Map(
    location=[37.559819, 126.963895],
    zoom_start=11, 
)

folium.GeoJson(
    seoul_geo,
    name='지역구'
).add_to(m)

m

# # m = folium.Map(
# #     location=[37.559819, 126.963895],
# #     zoom_start=11, 
# #     tiles='cartodbpositron'
# # )

# # folium.GeoJson(
# #     seoul_geo,
# #     name='지역구'
# # ).add_to(m)

# # m

# # 한글 폰트 설정
# plt.rcParams['font.family'] = 'NanumGothic'

# plt.figure(figsize=(12, 30))
# sns.countplot(y=seoul['상권업종중분류명'], order=seoul['상권업종중분류명'].value_counts().index)
# plt.yticks(fontsize=12)
# plt.title('서울시 업종별 개수')
# plt.show()

# # # 위도
# # latitude = 37.56375676378918
# # # 경도
# # longitude = 127.01867567800437
# # m = folium.Map(location=[latitude, longitude],zoom_start=18,width=750,height=500)
# # m

# # folium.Marker([latitude, longitude],
# #               popup="판교역",
# #               tooltip="판교역 입구", 
# #               icon=folium.Icon('red', icon='star'),
# #              ).add_to(m)
# # m


# #영상 링크 걸기
# # folium.Marker([latitude, longitude],
# #               popup='<iframe width="560" height="315" src="https://www.youtube.com/embed/dpwTOQri42s" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>',
# #               tooltip="다산공원").add_to(m)
# # m


# folium.CircleMarker([latitude, longitude],
#                     color='tomato',
#                     radius = 50, 
#                     tooltip='호미곳').add_to(m)
# m

m.save('map.html') 
#웹 브라우저 자동 열기
webbrowser.open("m.html")