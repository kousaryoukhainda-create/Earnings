import re
import sys

logs = open('/storage/internal_new/project/Earnings/build_logs.txt', 'rb').read().decode('utf-8', errors='ignore')

# Find the Build Debug APK section
sections = re.split(r'##\[command\]', logs)
for s in sections:
    if 'gradlew' in s.lower() or 'assemble' in s.lower():
        print(s[:5000].encode('ascii', errors='ignore').decode('ascii'))
        break
