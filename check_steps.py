import json
data = json.load(open('/tmp/jobs.json'))
for job in data.get('jobs', []):
    print('Steps:')
    for step in job.get('steps', []):
        conclusion = step.get('conclusion', 'unknown')
        status = 'OK' if conclusion == 'success' else 'FAIL'
        print(f"  [{status}] {step['number']}. {step['name']}: {conclusion}")
